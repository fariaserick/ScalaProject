import scala.collection.mutable._
import com.euler.Problems
import scala.math._


object Main {
  
  def main(args: Array[String]): Unit = {
    
    lazy val prob: Problems = new Problems();
    
//    print(prob.problem_01(1000));
    
//    print(prob.problem_02(4000000));
    
//    lazy val num = BigInt(600851475143);
//    print(prob.problem_03(600851475143L));
    
//    print(prob.problem_04(999));
    
//    print(prob.problem_05(20));
    
//    print(prob.problem_06(100));
    
    print(prob.problem_07(10));
    
//    print(prob.problem_08());
    
    // Question one
//    print(qOne(args(0).toInt)); 
    
    // Question two
//    print (qTwo(args(0).toInt));
    
    // Question three
//    println (qThree())
    
    // Question four
//    lazy val list = 1 to args(0).toInt;
//    println (qFour(list.toList))
    
  }
  
  def qOne(num: Int): List[Int] = {
    
    lazy val result = 1 to num
    
    for(i <- 1 to 5; j <- 1 to 4 if i == j) println(s"($i,$j)")
    
    return result.toList;
  }
  
  def qTwo(num: Int): String = {
    var result = num.toString;
    
//    lazy val x = for(i <- 1 to 10 if i % 2 != 0; j <- 1 to 5) println(s"$i,$j");
    lazy val y = for(i <- 1 to 10 if i % 2 != 0; j <- 1 to 5) yield(s"($i,$j)");
    
    println(y.toList)
    
    lazy val map = collection.mutable.Map[Int,String](0 -> "test"); // Means exactly the same as Map(("x", 24), ("y", 25), ("z", 26))
//    map = ("ttt" -> "test");
    
    map += (1 -> "tested",2 -> "Alabama");
    
//    map.foreach(m => println(m));
    
    result;
  }
  
  
  def qThree(): List[(String,String)] = {
    
    lazy val firstMonths = "January" :: "February" :: "March" :: Nil
    
    lazy val lastMonths = List("July", "August", "September");
    
    lazy val year = firstMonths ++ lastMonths;
    
    lazy val shortYear = year.map(_.substring(0,3))
    
    lazy val result = year.zip(shortYear);
    
//    result = firstMonths ::: lastMonths;
      
    result;
  }
  
  
  def qFour(list: List[Int]): List[Int] = {
    var result = list match {
      case head::tail => tail.reverse :+ head
      case Nil => List[Int]()
    }
    result;
  }
  
  
}