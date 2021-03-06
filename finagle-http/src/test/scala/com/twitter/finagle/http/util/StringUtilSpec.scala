package com.twitter.finagle.http.util

import com.twitter.util.TimeConversions._
import java.util.Date
import org.specs.Specification


object StringUtilSpec extends Specification {

  "StringUtilSpec" should {
    "toSomeShort" in {
      StringUtil.toSomeShort("0")             must be_==(0)
      StringUtil.toSomeShort("blarg")         must be_==(0)
      StringUtil.toSomeShort("1000000000000") must be_==(0)
    }

    "toSomeInt" in {
      StringUtil.toSomeInt("0")             must be_==(0)
      StringUtil.toSomeInt("blarg")         must be_==(0)
      StringUtil.toSomeInt("1000000000000") must be_==(0)
    }

    "toSomeLong" in {
      StringUtil.toSomeLong("0")                      must be_==(0L)
      StringUtil.toSomeLong("blarg")                  must be_==(0L)
      StringUtil.toSomeLong("1000000000000000000000") must be_==(0L)
    }
  }
}
