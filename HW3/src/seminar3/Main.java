package seminar3;

import seminar3.drugstore.Drug;
import seminar3.drugstore.IterableDrug;
import seminar3.drugstore.components.Component;
import seminar3.drugstore.components.child.Azitronite;
import seminar3.drugstore.components.child.Magnium;
import seminar3.drugstore.components.child.Penicillin;
import seminar3.drugstore.components.child.VitaminC;
import seminar3.drugstore.components.child.Water;
import seminar3.drugstore.drug.CatDrug;
import seminar3.drugstore.drug.DogDrug;
import seminar3.parent.VeterinaryClinic;
import seminar3.personal.Doctor;
import seminar3.personal.HeadPhysician;
import seminar3.personal.Nurse;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("-------------Iterator-------------");
        Drug dogDrug = new DogDrug();
        dogDrug.addComponent(new Water("������� ����", "200 ��", 1));
        dogDrug.addComponent(new Penicillin("����������", "10 ��", 10));

        while (((Iterator<Component>) dogDrug).hasNext()) {
            System.out.println(((Iterator<Component>) dogDrug).next());
        }

//        System.out.println("-------------���������� � ������-��������-------------");
//        dogDrug.getComponents();

        System.out.println("-------------Iterable-------------");

        IterableDrug catDrug = new CatDrug();
        catDrug.addComponent(new Water("Water", "150 ��", 2));
        catDrug.addComponent(new Azitronite("Azitronite", "5 ��", 20));

        for (Component component: catDrug) {
            System.out.println(component);
        }

        System.out.println("-------------Comparable-------------");

        IterableDrug catDrug1 = new CatDrug();
        IterableDrug catDrug2 = new CatDrug();
        IterableDrug catDrug3 = new CatDrug();

        catDrug1.addComponent(new Water("Water", "150 ��", 2));
        catDrug1.addComponent(new Azitronite("Azitronite", "5 ��", 15));
        catDrug1.addComponent(new VitaminC("VitaminC", "5 ��",5));

        catDrug2.addComponent(new Water("Water", "150 ��", 2));
        catDrug2.addComponent(new Azitronite("Azitronite", "5 ��", 15));
        catDrug2.addComponent(new Magnium("Magnium", "5 ��",5));

        catDrug3.addComponent(new Water("Water", "150 ��", 2));
        catDrug3.addComponent(new Azitronite("Azitronite", "5 ��", 13));
        catDrug3.addComponent(new Penicillin("Penicillin", "5 ��",7));
        

        List<IterableDrug> drugs = new ArrayList<>();
        drugs.add(catDrug);
        drugs.add(catDrug1);
        drugs.add(catDrug2);
        drugs.add(catDrug3);

        System.out.println("Не сортированный: ");
        System.out.println(drugs);
        System.out.println();
        System.out.println("Сортированный по power и по name компонента: ");
        Collections.sort(drugs);
        System.out.println(drugs);
        System.out.println();

        System.out.println("-------------Personal-------------");
        System.out.println();
        HeadPhysician headPhysician = new HeadPhysician("Ivan", "Ivanov");
        Doctor petr = new Doctor("Petr", "Petrov");
        Doctor semen = new Doctor("Semen", "Semenov");

        Nurse nadya = new Nurse("Nadejda", "Nadejdova");
        Nurse olga = new Nurse("Olga", "Ivanova");
        Nurse sasha = new Nurse("Sasha", "Petrova");
        Nurse mariya = new Nurse("Mariya", "Semenova");

        headPhysician.addSubordinate(petr).addSubordinate(semen);
        semen.addSubordinate(nadya).addSubordinate(olga);
        petr.addSubordinate(sasha).addSubordinate(mariya);

        VeterinaryClinic clinic = new VeterinaryClinic(headPhysician);

        clinic.forEach(System.out::println);

        System.out.println("---------------------------------");

        //todo
        // ��: 1.������� ���, ����� ����� ���������� ���� ����, � ���� result ���� ������ ��� ���������� �������
        // IterableDrug.
        // 2. ���������� compareTo ���, ����� ���� power �������� �����, ��������� ��� ��� �
        // �� ��������� ����������� ���������
        Set<IterableDrug> result = new HashSet<>(drugs);
        System.out.println(result.size()); // ��� ����� ������ ���� ����� 3, � �� 4!
        
        System.out.println("___________Проверка equals___________");
        Water w1 = new Water("SimpleWater", "150", 4);
        Water w2 = new Water("SimpleWater", "150", 4);
        Water w3 = new Water("SimpleWate12r", "150", 4);
        
        System.out.print("w1.equals(w2) = ");
        System.out.println(w1.equals(w2));
        System.out.print("w1.equals(w3) = ");
        System.out.println(w1.equals(w3));

        System.out.println("___________Проверка HashSet___________");
        Set<Component> simpleSet = new HashSet<>();
        simpleSet.add(w1);
        simpleSet.add(w2);
        simpleSet.add(w3);
        
        System.out.println(simpleSet);
    }
}
