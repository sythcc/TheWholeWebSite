package TestForDebug;

import java.util.Iterator;
import java.util.LinkedList;

public class TestHanShu {

	public LinkedList<Double> FangCheng(float a, float b, float c) {
		// 此处实现方程这个函数，3个参数，abc，表示ax^2+bx^2+c=0这个方程，求x的可能值
		double x1 = 0;
		double x2 = 0;
		// 此处定义x的两个值
		LinkedList<Double> l = new LinkedList<Double>();
		// 新建一个链表L，用来存储x的解
		if (b * b - 4 * a * c > 0) {
			// 此条件下,X有两个解
			x1 = (-b + Math.pow((b * b - 4 * a * c), 0.5)) / (2 * a);
			// 此处是按照数学公式，求解方程的根
			l.add(x1);
			x2 = (-b - Math.pow((b * b - 4 * a * c), 0.5)) / (2 * a);
			l.add(x2);
		} else if (b * b - 4 * a * c == 0) {
			// 此条件证明该方程只有一个解
			x1 = (-b + Math.pow((b * b - 4 * a * c), 0.5)) / (2 * a);
			l.add(x1);
			System.out.println("x只有一个解！");
		} else {
			// b*b-4*a*c<0属于无虚数，故无解
			System.out.println("x的解是无理数！");
		}
		return l;
		// 返回L链表
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestHanShu th = new TestHanShu();
		// 新建一个类的对象
		LinkedList<Double> l1 = th.FangCheng(5, 100, 5);
		// 分别输入a,b,c的值
		Iterator<Double> l2 = l1.iterator();
		// 做一个迭代器
		while (l2.hasNext()) {
			// 遍历输入结果
			System.out.println("X的解为： "+l2.next());
		}
	}
}
