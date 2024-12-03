package designpattern.composite;

/**
 * 组合模式：用于处理树形结构，将单个对象和组合对象统一处理。
 * 
 * @author liu yuning
 *
 */
public class CompositeClient {

    public static void main(String[] args) {
	// 生成树根，根上长出两叶Leaf A和Leaf B
	Composite root = new Composite("root");
	root.add(new Leaf("Leaf A"));
	root.add(new Leaf("Leaf B"));

	// 根上长出分支Composite X，分支上也有两叶Leaf X-A和Leaf X-B
	Composite compositeX = new Composite("Composite X");
	compositeX.add(new Leaf("Leaf X-A"));
	compositeX.add(new Leaf("Leaf X-B"));
	root.add(compositeX);

	// 在Composite X上再长出分支Composite X-Y，分支上也有两叶Leaf X-Y-A和Leaf X-Y-B
	Composite compositeXY = new Composite("Composite X-Y");
	compositeXY.add(new Leaf("Leaf X-Y-A"));
	compositeXY.add(new Leaf("Leaf X-Y-B"));
	compositeX.add(compositeXY);

	// 显示大树的样子
	root.display(1);
    }
}
