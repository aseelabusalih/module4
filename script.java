// val is fixing the reference, not the values
val myList = mutableListOf("tuna","salmon", "shark")
myList.remove("shark")

println(myList)

// Add Whale
val fixedRefWhales: MutableList<String> = mutableListOf("white whale", "Shark Whale")
fixedRefWhales.add("Great Whale")

// Looping and Collection Examples
var fish = 12
var plants = 5
val swarm = listOf(fish, plants)

val school = arrayOf("tuna","salmon", "shark") // Untyped --> mixed arrays possible
val numbers = intArrayOf(1,2,3) // Typed array

val mixedArray = arrayOf(1,2,"shark")
println(Arrays.toString(mixedArray))

// Nested Arrays
val bigSwarm = arrayOf(swarm, arrayOf("whale", "orka", "dolphin")
                       
// 
val generateNumberArray = Array(5) { it * 2}
// val generateNumberArray = Array(5) item -> it * 2 //my guess!

println(array.asList())
                       

//  Looping
for (element in swarm) println (element)
                       
// Loop over Index
for ((index, element) in swarm.withIndex()){
  println("Fish at $index is $element!")
}
                       
// Range in Alphabet
for (i in 'b' .. 'g') print i
// outputs> bcdefg

// ranges of numbers
for (i in 1..5) print(i)
// > 12345

// Range downwards
for (i in 5 downTo 1) print(i)
                       
// Range with Steps
for (i in 3..10 step 2) print(i)
// > 3579