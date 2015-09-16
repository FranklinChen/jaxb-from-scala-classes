package com.franklinchen;

import javax.xml.bind.annotation.*;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class JCustomer {
    @XmlAttribute int id;
    @XmlElement String name;
    @XmlElement int age;

    public JCustomer(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    // For JAXB only.
    private JCustomer() {}
}
