package com.gaocai.vo;

public class StudentAndClassroomVo {

    private String sid;
    private String sname;
    private int sage;
    private String saddress;

    private String cid;
    private String cname;

    public void setSid(String sid) {
        this.sid = sid;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public void setSage(int sage) {
        this.sage = sage;
    }

    public void setSaddress(String saddress) {
        this.saddress = saddress;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getSid() {
        return sid;
    }

    public String getSname() {
        return sname;
    }

    public int getSage() {
        return sage;
    }

    public String getSaddress() {
        return saddress;
    }

    public String getCid() {
        return cid;
    }

    public String getCname() {
        return cname;
    }

    @Override
    public String toString() {
        return "StudentAndClassroomVo{" +
                "sid='" + sid + '\'' +
                ", sname='" + sname + '\'' +
                ", sage=" + sage +
                ", saddress='" + saddress + '\'' +
                ", cid='" + cid + '\'' +
                ", cname='" + cname + '\'' +
                '}';
    }
}
