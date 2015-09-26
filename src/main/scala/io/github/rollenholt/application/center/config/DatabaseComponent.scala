package io.github.rollenholt.application.center.config

import javax.sql.DataSource

import com.mchange.v2.c3p0.ComboPooledDataSource
import org.apache.ibatis.session.SqlSessionFactory
import org.mybatis.spring.SqlSessionFactoryBean
import org.mybatis.spring.mapper.MapperFactoryBean
import org.springframework.beans.factory.annotation.Value
import org.springframework.context.annotation.{Bean, PropertySource}
import org.springframework.core.io.support.PathMatchingResourcePatternResolver
import org.springframework.jdbc.datasource.DataSourceTransactionManager
import org.springframework.stereotype.Component
import org.springframework.transaction.annotation.EnableTransactionManagement

/**
 * @author rollenholt 
 */
@PropertySource(value = Array("classpath:jdbc.properties"))
@Component
@EnableTransactionManagement
class DatabaseComponent {

  @Value("${driverClass}")
  private var driverClass: String = _

  @Value("${jdbcUrl}")
  private var jdbcUrl: String = _

  @Value("${username}")
  private var user: String = _

  @Value("${password}")
  private var password: String = _

  @Bean
  def getDataSource(): DataSource = {
    val ds = new ComboPooledDataSource()
    ds.setDriverClass(driverClass)
    ds.setJdbcUrl(jdbcUrl)
    ds.setUser(user)
    ds.setPassword(password)
    ds.setInitialPoolSize(10)
    ds.setMaxPoolSize(30)
    ds.setMaxIdleTime(600)
    ds.setMaxStatements(40)
    ds.setAutoCommitOnClose(true)
    ds
  }

  @Bean
  def getDataSourceTransactionManager(): DataSourceTransactionManager = {
    new DataSourceTransactionManager(getDataSource())
  }

  @Bean
  def getSqlSessionFactory(): SqlSessionFactory = {
    val resolver: PathMatchingResourcePatternResolver = new PathMatchingResourcePatternResolver()
    val sessionFactory: SqlSessionFactoryBean = new SqlSessionFactoryBean();
    sessionFactory.setDataSource(getDataSource());
    sessionFactory.setMapperLocations((resolver.getResources("classpath*:mapper/*.xml")))
    sessionFactory.getObject
  }

  def getMapper[T](mapperInterface: Class[T]) = {
    val factoryBean: MapperFactoryBean[T] = new MapperFactoryBean[T]()
    factoryBean.setSqlSessionFactory(getSqlSessionFactory())
    factoryBean.setMapperInterface(mapperInterface)
    factoryBean
  }

}
