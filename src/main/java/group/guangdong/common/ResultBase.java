package group.guangdong.common;

public class ResultBase<T> {
	Integer status;
	String msg;
	T data;

	public ResultBase() {
	}

	public ResultBase(Integer status, String msg) {
		this.status = status;
		this.msg = msg;
	}

	public ResultBase(Integer status, String msg, T data) {
		this.status = status;
		this.msg = msg;
		this.data = data;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "ResultBase{" + "status=" + status + ", msg='" + msg + '\'' + ", data=" + data + '}';
	}

}
