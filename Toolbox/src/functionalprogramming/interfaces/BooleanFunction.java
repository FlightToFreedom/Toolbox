package functionalprogramming.interfaces;

@FunctionalInterface
public interface BooleanFunction<T extends Number>
{
  public boolean evaluate(T first, T second);
}
