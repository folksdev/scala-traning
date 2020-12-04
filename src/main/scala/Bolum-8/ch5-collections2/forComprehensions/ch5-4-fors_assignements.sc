val priceTags =  Seq(100, 200, 3000)
def expensive(x: Int): Int = x/100

//create pairs Seq((1,expensive(1)), …),
//only in case expensive is > 5
for {
  x <- priceTags
  y = expensive(x)
  if y >= 10
} yield (x,y)

//some pattern matching
