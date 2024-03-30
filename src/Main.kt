fun main (){
val person = person("Ajema",22,"Kenya")
    person.details()

    val rectangle = rectangle(23.3,15.6)
    rectangle.area()


    val book = book("pompei","Kabaka Mwali",2002)
    book.bookDetails()

    val car = car("Audi","cx4","black")
    car.carInfo()

    val animal = animal("cat","meows")
    animal.makeSound()
}


class person(var name:String,var age:Int,var country:String){
  fun details() {
      println("my name is $name i am $age years old from $country")
  }
}

class rectangle(var width:Double,var height:Double){
    fun area(){
        println(width*height)
    }
}

class book(var title:String,var author:String,var year:Int){
    fun bookDetails(){
     println("i am currently reading $title by $author which was published in $year")
    }
}

class car (var make:String,var model:String,var color:String){
 fun carInfo(){
     println("she bought a $color $make $model today")
 }
}

class animal (var name: String,var sound:String){
    fun makeSound(){
        println("my $name $sound")
    }
}