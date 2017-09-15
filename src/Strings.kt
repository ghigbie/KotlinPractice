fun main(args: Array<String>){
    val str = "May the force \nbe with you." //this is an escaped string
    println(str)

    val str1 = "Darth Vader said the funniest thing. He said \"May the force be with you.\""
    println(str1)

    val str2 = "I know the \t\t\tmeaning of life"
    println(str2)

    //raw string
    val rawCrawl = """|Dolces gatos
|mal halladas
    |por todas partes
    |yes yes yes
    |del cuart""".trimMargin() //the default pipe of this method trims off the white space
    println(rawCrawl)

    for(char in str){
        println(char)
    }

    println(str.contentEquals("May the force \nbe with you."))

    val contains = str.contains("force", true)
    println(contains)
    val contains2 = str.contains("Force", false)
    println(contains2)

    val uppercase = str.toUpperCase()
    println(uppercase)
    val lowercase = str.toLowerCase()
    println(lowercase)

    val num = 6
    val stringNum = num.toString();
    println(stringNum)

    val sub = str.subSequence(4, 13)
    println(sub)

    //string templates
    val luke = "Luke Skywalker"
    val lightSaberColor = "green"
    val vehicle = "landspeeder"

    val lukeSentence = "$luke has a $lightSaberColor lightsaber and drives a $vehicle"
    println(lukeSentence)

    val han = "Han Solo"
    val blasterColor = "black"
    val vehicle1 = "Millenial Falcon"

    val hanSentence = "$han has a $blasterColor blaster and flys the $vehicle1"
    println(hanSentence)


}