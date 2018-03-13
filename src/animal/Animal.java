/**
 * 
 */
package animal;

/**
 * @description:
 * @author: Admin
 * @time: 8:46:22 PM
 * @date: Mar 5, 2018
 */
public class Animal {

	/**
	 * 
	 */
	private int soChan;

	/**
	 * @return the soChan
	 */
	public int getSoChan() {
		return soChan;
	}

	/**
	 * @param soChan
	 *            the soChan to set
	 */
	public void setSoChan(int soChan) {
		this.soChan = soChan;
	}

	/**
	 * @description:
	 * @author: Admin CMC Corporation
	 * @create_date: Mar 5, 2018
	 * @modifier: Admin
	 * @modifined_date: Mar 5, 2018
	 * @exception:
	 */
	public void eat() {
		System.out.println("animal eat");
	}

	/**
	 * @description:
	 * @author: Admin CMC Corporation
	 * @create_date: Mar 5, 2018
	 * @modifier: Admin
	 * @modifined_date: Mar 5, 2018
	 * @exception:
	 */
	public void go() {
		System.out.println("animal go");
	}
}
