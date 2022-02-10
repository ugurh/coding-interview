package generics;

public class GenericClass<T>{

    T obj;

    public GenericClass(T t){
        this.obj = t;
    }

    public T getObj() {
        return obj;
    }

}

class GenericClassTest{

    public static void main(String[] args) {
        GenericClass<String> str = new GenericClass<>("String Data Type");
        System.out.println(str.getObj());

        GenericClass<Integer> intType = new GenericClass<>(15);
        System.out.println(intType.getObj());

        GenericClass<People> peopleType  = new GenericClass<>(new People("Harun"));
        System.out.println(peopleType.getObj().getClass().getName());
        System.out.println(peopleType.getObj().getName());
    }
}