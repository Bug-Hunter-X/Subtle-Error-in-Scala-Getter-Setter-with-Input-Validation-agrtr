```scala
class MyClass(val name: String, initialAge: Int = 0) {
  private var _age: Int = {
    if (initialAge < 0) 0 // Handle negative initial age
    else initialAge
  }

  def age: Int = _age
  def age_=(newAge: Int): Unit = {
    _age = Math.max(0, newAge) //Ensures age is never negative
  }
}
```