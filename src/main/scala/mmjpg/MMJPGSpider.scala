package mmjpg

import com.gaocegege.scrala.core.common.response.impl.HttpResponse
import com.gaocegege.scrala.core.spider.impl.DefaultSpider

/**
  * Created by xxh on 18-11-27.
  */
class MMJPGSpider extends DefaultSpider{
  override def startUrl: List[String] = /*(2 to 103 )*/List("http://www.mmjpg.com/")

  override def parse(response: HttpResponse): Unit = {
    val links = (response getContentParser) select ("div[class=pic]") select("a")
    for (i <- 0 to links.size() - 1) {
      request(((links get (i)) attr ("href")), printIt)
      request(((links get (i)) select ("img") attr  ("src")), printIt)
    }
  }

  def printIt(response: HttpResponse): Unit = {
    println((response getContentParser) title)
  }
}
