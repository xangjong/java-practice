package ch13_generic.sec06;

// 제네릭 타입 클래스
// T: 객체  
// M : String
public class Product<T, M> {
	private T kind;
	private M model;

	public T getKind() {
		return kind;
	}

	public void setKind(T kind) {
		this.kind = kind;
	}

	public M getModel() {
		return model;
	}

	public void setModel(M model) {
		this.model = model;
	}

}
