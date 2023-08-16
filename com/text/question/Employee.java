package com.text.question;

public class Employee {
    private String name;  //이름
    private String department; // 부서
    private String position; // 직책
    private String tel; //전번
    private Employee boss; // 상사

    public void setName(String name) {
        if (name.length() < 2 && name.length() > 5) {
            return;
        }
        for (int i = 0; i < name.length(); i++) {
            char c = name.charAt(i);
            if (c < '가' && c > '힣') {
                return;
            }
        }
        this.name = name;

    }

    public void setDepartment(String department) {
        if (department.equals("영업부")
                || department.equals("기획부")
                || department.equals("총무부")
                || department.equals("개발부")
                || department.equals("홍보부")) {
        this.department = department;
        }
    }

    public void setPosition(String position) {
        if (position.equals("부장")
                || position.equals("과장")
                || position.equals("대리")
                || position.equals("사원")) {

            this.position = position;
        }
    }

    public void setTel(String tel) { // e1.setTel("010-1234-5678");
        if (tel.indexOf("-") != 3 || tel.lastIndexOf("-") != 5) {
            return;
        }
        String temp = tel.replace("-", "");
        for (int i = 0; i < temp.length(); i++) {
            char c = temp.charAt(i);
            if (c < '0' || c > '9') {
                return;
            }
        }
        this.tel = tel;
    }

    public void setBoss(Employee boss) {
        if (boss == null) {
           return;
        }
        if ((name.equals(boss.getName()) && department.equals(boss.getDepartment()) && position.equals(boss.getPosition()) && tel.equals(boss.getBoss()))) {
            return;
        }
        if (!(department.equals(boss.getDepartment()))) {
            return;
        }
            this.boss = boss;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public String getPosition() {
        return position;
    }

    public String getTel() {
        return tel;
    }

    public Employee getBoss() {
        return boss;
    }

    public void info() {
        String str = "";
        str += "[" + name + "]\n";
        str += String.format("-부서: %s\n", department);
        str += String.format("-직위: %s\n", position);
        str += String.format("-연락처: %s\n", tel);

        if (boss != null) {
            str += String.format("-직속상사 : %s(%s %s)", boss.getName(), boss.getDepartment(), boss.getPosition());
        } else {
            str += "-직속상사 : 없음";
        }

        System.out.println(str);

    }
}
