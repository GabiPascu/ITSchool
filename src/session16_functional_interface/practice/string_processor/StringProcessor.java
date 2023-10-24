package session16_functional_interface.practice.string_processor;
@FunctionalInterface
public interface StringProcessor {

    String process (String input);

    default StringProcessor andThen(StringProcessor after) {
        return input -> after.process(this.process(input));
    }
}
