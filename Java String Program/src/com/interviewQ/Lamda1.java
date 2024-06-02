package com.interviewQ;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Lamda1 {
        private String name;
        private String modelId;
        private String processor;
        private String ram;
        private double price;

        public Lamda1(String name, String modelId, String processor, String ram, double price) {
            this.name = name;
            this.modelId = modelId;
            this.processor = processor;
            this.ram = ram;
            this.price = price;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getModelId() {
            return modelId;
        }

        public void setModelId(String modelId) {
            this.modelId = modelId;
        }

        public String getProcessor() {
            return processor;
        }

        public void setProcessor(String processor) {
            this.processor = processor;
        }

        public String getRam() {
            return ram;
        }

        public void setRam(String ram) {
            this.ram = ram;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        @Override
        public String toString() {
            return "PC{" +
                    "name='" + name + '\'' +
                    ", modelId='" + modelId + '\'' +
                    ", processor='" + processor + '\'' +
                    ", ram='" + ram + '\'' +
                    ", price=" + price +
                    '}';
        }
    }

}

public class TestComparator {
    public static void main(String[] args) {
        ArrayList<Lamda1> list = new ArrayList<Lamda1>();
        list.add(new Lamda1("Acer Chromebook", "NX.HVVSI.007", "Intel Celeron", "4GB", 21000));
        list.add(new Lamda1("hp-pavilion-laptop", "14-dv2053TU", "Intel Iris", "8GB", 35000));
        Collections.sort(list,new priceComparator());
    }
}
public class priceComparator implements Comparator<Lamda1>{

    @Override
    public int compare(Lamda1 o1, Lamda1 o2) {
        return Integer.valueOf((int) (o1.getPrice()-o2.getPrice()));
    }
}
<div class="lesson" *ngIf="lessons"
        *ngFor="let lesson of lessons">
            <div class="lesson-detail">
                    {{lesson | json}}
</div>
</div>