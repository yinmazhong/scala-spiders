package spider12306

import com.gaocegege.scrala.core.common.response.impl.HttpResponse
import com.gaocegege.scrala.core.spider.impl.DefaultSpider

class Piao12306Spider extends DefaultSpider{
  override def startUrl: List[String] =
    //List("https://kyfw.12306.cn/otn/leftTicket/init?linktypeid=dc&fs=%E6%B7%B1%E5%9C%B3,SZQ&ts=%E9%9D%92%E5%B7%9E%E5%B8%82,QZK&date=2018-12-28&flag=N,N,Y")
    List("https://kyfw.12306.cn/otn/leftTicket/query?leftTicketDTO.train_date=2018-12-28&leftTicketDTO.from_station=SZQ&leftTicketDTO.to_station=QZK&purpose_codes=ADULT")

  override def parse(response: HttpResponse): Unit = {
    val res = response.getContent()
    println("------------------------")
    println(res)
    println("------------------------")
  }
}
