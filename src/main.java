
/**
 * 
 */

import abstracts.Maybay;
import abstracts.Oto;
import abstracts.PhuongTien;
import animal.Cat;
import interfaces.CayPoMu;
import interfaces.CayTre;

/**
 * @description:
 * @author: Admin
 * @time: 7:54:52 PM
 * @date: Mar 5, 2018
 */
public class main {
	private static Student student = new Student();
	private static Student studentTwo = new Student("HQT", 29, true);
	private static Cat cat = new Cat();
	private static PhuongTien phuongTien ;
	private static PhuongTien phuongTien2 ;
	int a;
	private static CayTre cayTre;
	private static CayPoMu cayPoMu;
	
	/*
	 * 
	 */
	int age;

	/**
	 * @description:
	 * @author: Admin CMC Corporation
	 * @create_date: Mar 5, 2018
	 * @modifier: Admin
	 * @modifined_date: Mar 5, 2018
	 * @exception:
	 * @param args
	 */
	public static void main(String[] args) {

		// TODO Auto-generated method stub
		System.out.println(student.getAge());
		System.out.println(student.getStudentName());
		System.out.println(String.valueOf(student.isGender()));
		
		System.out.println("************************");

		System.out.println(studentTwo.getAge());
		System.out.println(studentTwo.getStudentName());
		System.out.println(String.valueOf(studentTwo.isGender()));
		studentTwo.hienThi();
		studentTwo.hienThi("xin chao");
		
		
		System.out.println("**********Ke thua**************");

		cat.setSoChan(10);
		System.out.println("**********cat.eat()**************");
		cat.eat();
		System.out.println("**********cat.go()**************");
		cat.go();
		System.out.println(String.valueOf(cat.getSoChan()));
		System.out.println();
		System.out.println();
		System.out.println("**********Truu tuong**************");
		phuongTien = new Oto();
		phuongTien.diChuyen();
		phuongTien2= new Maybay();
		phuongTien2.diChuyen();
		System.out.println("**********Truu tuong- interface**************");
		cayTre  = new CayTre();
		cayTre.use();
		cayPoMu = new CayPoMu();
		cayPoMu.use();
		
	}

	/**
	 * @description: caculate salary of employ
	 * @author: Admin CMC Corporation
	 * @create_date: Mar 5, 2018
	 * @modifier: Admin
	 * @modifined_date: Mar 5, 2018
	 * @exception:
	 * @param heSoLuong
	 * @param soThang
	 * @return salary of employ
	 */
	public static double caculateSalary(int heSoLuong, int soThang) {
		return heSoLuong * 1000000 * soThang;
	}

}
