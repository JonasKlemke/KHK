package sample;

import java.util.ArrayList;

/**
 * Created by Fklemke on 04.07.17.
 */
public class Content {
    public boolean info;
    public boolean endpoint;
    public boolean exception;
    public ArrayList<String> arrList;
    public String textContent;
    public AttendingDoc attendingDoc;
    public Content prevContent;
    public Content nextContent;
    public Content yesContent;
    public Content noContent;

    public Content(boolean info, boolean endpoint, String textContent, Content prevContent) {
        this.info = info;
        this.endpoint = endpoint;
        this.textContent = textContent;
        this.prevContent = prevContent;
    }

    public Content(boolean info, boolean endpoint, String textContent, AttendingDoc attendingDoc, Content prevContent) {
        this.info = info;
        this.endpoint = endpoint;
        this.textContent = textContent;
        this.attendingDoc = attendingDoc;
        this.prevContent = prevContent;
    }

    //for question elements
    public Content(boolean info, boolean endpoint, String textContent, Content prevContent, Content yesContent, Content noContent) {
        this.info = info;
        this.endpoint = endpoint;
        this.textContent = textContent;
        this.prevContent = prevContent;
        this.yesContent = yesContent;
        this.noContent = noContent;
    }

    public boolean isInfo() {
        return info;
    }

    public boolean isEndpoint() {
        return endpoint;
    }

    public String getTextContent() {
        return textContent;
    }

    public AttendingDoc getAttendingDoc() {
        return attendingDoc;
    }

    public Content getPrevContent() {
        return prevContent;
    }

    public Content getNextContent() {
        return nextContent;
    }

    public Content getYesContent() {
        return yesContent;
    }

    public Content getNoContent() {
        return noContent;
    }

    public void setInfo(boolean info) {
        this.info = info;
    }

    public void setEndpoint(boolean endpoint) {
        this.endpoint = endpoint;
    }

    public void setTextContent(String textContent) {
        this.textContent = textContent;
    }

    public void setAttendingDoc(AttendingDoc attendingDoc) {
        this.attendingDoc = attendingDoc;
    }

    public void setPrevContent(Content prevContent) {
        this.prevContent = prevContent;
    }

    public void setNextContent(Content nextContent) {
        this.nextContent = nextContent;
    }

    public void setYesContent(Content yesContent) {
        this.yesContent = yesContent;
    }

    public void setNoContent(Content noContent) {
        this.noContent = noContent;
    }

    
    //Exceptions
	public boolean isException() {
		return exception;
	}

	public void setException(boolean exception) {
		this.exception = exception;
	}

	public ArrayList getArrList() {
		return arrList;
	}

	public void setArrList(ArrayList arrList) {
		this.arrList = arrList;
	}
    
    
}


