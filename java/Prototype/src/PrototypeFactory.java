public class PrototypeFactory
{
    public static PrototypeCloneable getInstance(PrototypeCloneable cloneableObj) throws CloneNotSupportedException {
        return cloneableObj.clone();
    }
}