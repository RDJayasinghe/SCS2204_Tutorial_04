object q3{
    def toUpper(str:String):String={
        str.toUpperCase()
    }

    def toLower(str:String):String={
        str.toLowerCase()
    }

    def formatNames(name:String)(index:Int)(Func: String=>String):String={

        if(index>0 && index<name.length()){
        var str=""
        str=name.substring(0,index)
        str=str+Func(name.charAt(index).toString())
        str=str+name.substring(index+1,name.length())
        return str
        }else{
        return Func(name)
        }

    }

    def main(args: Array[String]): Unit = {

        println(formatNames("Benny")(-1)(toUpper));
        println(formatNames("Niroshan")(1)(toUpper));
        println(formatNames("Saman")(-1)(toLower));
        println(formatNames("Kumara")(5)(toUpper));

    }


}

