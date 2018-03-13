/**
 * 
 */

/**
 * @description: define Student class
 * @author: Admin
 * @time: 8:18:43 PM
 * @date: Mar 5, 2018
 */
public class Student {
	//
	private String studentName;
	//
	private int age;
	//
	private boolean gender;

	/**
	 * @description:
	 * @author: Admin CMC Corporation
	 * @create_date: Mar 5, 2018
	 * @modifier: Admin
	 * @modifined_date: Mar 5, 2018
	 * @exception:
	 * @param studentName
	 * @param age
	 * @param gender
	 */

	public Student(String studentName, int age, boolean gender) {
		super();
		this.studentName = studentName;
		this.age = age;
		this.gender = gender;
	}

	/**
	 * @description:
	 * @author: Admin CMC Corporation
	 * @create_date: Mar 5, 2018
	 * @modifier: Admin
	 * @modifined_date: Mar 5, 2018
	 * @exception:
	 */
	public void hienThi() {
		System.out.println(" Name: " + this.studentName + " age: " + this.age);
	}

	/**
	 * @description:
	 * @author: Admin CMC Corporation
	 * @create_date: Mar 5, 2018
	 * @modifier: Admin
	 * @modifined_date: Mar 5, 2018
	 * @exception:
	 * @param welcome
	 */
	public void hienThi(String welcome) {
		System.out.println(welcome + " Name: " + this.studentName + " age: " + this.age);
	}

	/**
	 * @description:
	 * @author: Admin CMC Corporation
	 * @create_date: Mar 5, 2018
	 * @modifier: Admin
	 * @modifined_date: Mar 5, 2018
	 * @exception:
	 */
	Student() {

	}

	/**
	 * @return the studentName
	 */
	public String getStudentName() {
		return studentName;
	}

	/**
	 * @param studentName
	 *            the studentName to set
	 */
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age
	 *            the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}

	/**
	 * @return the gender
	 */
	public boolean isGender() {
		return gender;
	}

	/**
	 * @param gender
	 *            the gender to set
	 */
	public void setGender(boolean gender) {
		this.gender = gender;
	}

}
