package com.phil.mobile

@groovy.transform.ToString
class Driver implements Serializable {
    String first,last,email

    String fullName

    void setFullName(String name) {
        fullName = name
    }

    String getFullName() {
        "Full Name: ${fullName}"
    }
}
