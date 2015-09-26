package io.github.rollenholt.application.center.base.dao

import com.mchange.v2.c3p0.ComboPooledDataSource
import slick.driver.MySQLDriver.api._


/**
 * @author rollenholt 
 */
trait DatabaseComponent {

  private[this] val url: String = "jdbc:mysql://localhost:3306/test"
  private[this] val driver: String = "com.mysql.jdbc.Driver"
  private[this] val user: String = "root"
  private[this] val password: String = ""

  val db = {
    val ds = new ComboPooledDataSource()
    ds.setDriverClass(driver)
    ds.setJdbcUrl(url)
    ds.setUser(user)
    ds.setPassword(password)
    ds.setInitialPoolSize(10)
    ds.setMaxPoolSize(30)
    ds.setMaxIdleTime(600)
    ds.setMaxStatements(40)
    ds.setAutoCommitOnClose(true)
    Database.forDataSource(ds)
  }

  implicit val JavaUtilDateMapper =
    MappedColumnType.base[java.util.Date, java.sql.Timestamp](
      d => new java.sql.Timestamp(d.getTime),
      d => new java.util.Date(d.getTime)
    )

}
