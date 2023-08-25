//define  as  operações  primitivas abstratas  (partes  do  algoritmo),  que  devem  ser implementadas   pelas   subclasses   e   define   o método-template, que invoca operações primitivas.
public abstract class AbstractClass {
    public abstract void primitiveOperation1();

    public abstract void primitiveOperation2();

    public void templateMethod() {
        primitiveOperation1();
        primitiveOperation2();
    }
}