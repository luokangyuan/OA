package cn.luo.ssm.po;

import java.util.Date;

public class Alonework {
    private Integer todoId;

    private Integer staId;

    private String todoTitle;

    private String todoContent;

    private Date todoCreate;

    private String todoType;

    private String todoimpor;
    
    private String startTime;
	private String endTime;
	
	private String todoFile;
	
	private String stanumber;
	
	private String createAuthor;
	
	private String staname;
	
	
	private String order;//排序方式
	
	private String sort;//排序字段
	
	private String todoServerName;
	
	
   

	public String getStaname() {
		return staname;
	}

	public void setStaname(String staname) {
		this.staname = staname;
	}

	public String getStanumber() {
		return stanumber;
	}

	public void setStanumber(String stanumber) {
		this.stanumber = stanumber;
	}

	public String getTodoServerName() {
		return todoServerName;
	}
    
	public String getCreateAuthor() {
		return createAuthor;
	}

	public void setCreateAuthor(String createAuthor) {
		this.createAuthor = createAuthor;
	}

	public void setTodoServerName(String todoServerName) {
		this.todoServerName = todoServerName;
	}

	public String getTodoFile() {
		return todoFile;
	}

	public void setTodoFile(String todoFile) {
		this.todoFile = todoFile;
	}

	public String getStartTime() {
		return startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getEndTime() {
		return endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public String getOrder() {
		return order;
	}

	public void setOrder(String order) {
		this.order = order;
	}

	public String getSort() {
		return sort;
	}

	public void setSort(String sort) {
		this.sort = sort;
	}

	public Integer getTodoId() {
        return todoId;
    }

    public void setTodoId(Integer todoId) {
        this.todoId = todoId;
    }

    public Integer getStaId() {
        return staId;
    }

    public void setStaId(Integer staId) {
        this.staId = staId;
    }

    public String getTodoTitle() {
        return todoTitle;
    }

    public void setTodoTitle(String todoTitle) {
        this.todoTitle = todoTitle == null ? null : todoTitle.trim();
    }

    public String getTodoContent() {
        return todoContent;
    }

    public void setTodoContent(String todoContent) {
        this.todoContent = todoContent == null ? null : todoContent.trim();
    }

    public Date getTodoCreate() {
        return todoCreate;
    }

    public void setTodoCreate(Date todoCreate) {
        this.todoCreate = todoCreate;
    }

    public String getTodoType() {
        return todoType;
    }

    public void setTodoType(String todoType) {
        this.todoType = todoType == null ? null : todoType.trim();
    }

    public String getTodoimpor() {
        return todoimpor;
    }

    public void setTodoimpor(String todoimpor) {
        this.todoimpor = todoimpor == null ? null : todoimpor.trim();
    }
}