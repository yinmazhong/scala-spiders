package mmjpg

import com.gaocegege.scrala.core.common.response.impl.HttpResponse
import com.gaocegege.scrala.core.spider.impl.DefaultSpider

/**
  * Created by xxh on 18-11-27.
  */
object MMJPGMain {
  def main(args: Array[String]): Unit = {
    val test = new MMJPGSpider
    test begin
  }


}
