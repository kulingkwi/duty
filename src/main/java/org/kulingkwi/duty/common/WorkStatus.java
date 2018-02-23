package org.kulingkwi.duty.common;

import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * File: WorkStatus.java
 * Desc:
 * Author: gui chulin
 * Datetime: 2018-02-15  08:30
 */
@JsonFormat(shape = JsonFormat.Shape.OBJECT)
public enum WorkStatus {
    BAI("1", "白"), YE("2", "夜"), XIA("3", "下"), XIU("4", "休"), JI1("5", "机动1"), JI2("6", "机动2") ;

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
