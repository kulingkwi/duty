package org.kulingkwi.duty.common;

/**
 * File: WorkStatus.java
 * Desc:
 * Author: gui chulin
 * Datetime: 2018-02-15  08:30
 */
public enum WorkStatus {
    BAI("1", "白"), DA("2", "大"), XIAO("3", "小"), XIA("4", "下"), XIU("5", "休") ;

    private String id;
    private String value;

    private WorkStatus(String id, String value) {
        this.id = id;
        this.value = value;
    }

    public String getId() {
        return id;
    }

    public String getValue() {
        return value;
    }

    public static WorkStatus from(String id) {
        WorkStatus status = null;
        for (WorkStatus s : values()) {
            if (s.id.equals(id)) {
                status = s;
                break;
            }
        }

        return status;
    }

    @Override
    public String toString() {
        return id + "-" + name();
    }
}
