class Student(var rno:Int,var sname:String,var sub1:Int,var sub2:Int)
{
	var ptage:Float=(sub1+sub2/200)*100;
	def display()
	{
		println("Roll No:"+rno);
		println("Name:"+sname);
		println("Percentage:"+ptage);
	}
}
object Prg20
{
	def main(args:Array[String])
	{
		val s1=new Student(1,"Ajinkya Bhosale",80,70);
		val s2=new Student(2,"Sahil Bhosale",75,85);
		val s3=new Student(3,"Rushikesh Bacchbnav",77,87);
		val s4=new Student(4,"Subodh Shelke",89,99);
		val s5=new Student(5,"Siddhant Bhadane",84,87);
	
		val m1:Map[Int,Student]=Map(1->s1,2->s2,3->s3,4->s4,5->s5);
		
		var max=m1(1).ptage;
		for((k,v)<-m1)
		{
			if(m1(k).ptage>max)
				max=m1(k).ptage;
		}
		for((k,v)<-m1)
		{
			if(m1(k).ptage==max)
				m1(k).display()
		}
	}
}

