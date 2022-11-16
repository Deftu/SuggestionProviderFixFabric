package com.harleyoconnor.suggestionproviderfix.mixin;

import net.minecraft.command.CommandSource;
import net.minecraft.util.Identifier;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

import java.util.function.Consumer;
import java.util.function.Function;

/**
 * @author Harley O'Connor
 */
@Mixin(CommandSource.class)
public interface CommandSourceMixin {
    /**
     * Overwrites {@link CommandSource#forEachMatching(Iterable, String, Function, Consumer)}. This is an
     * {@link Overwrite} since mixin doesn't currently allow injectors in interfaces.
     *
     * <p>Difference in this method to the original is that it negates a check for the namespace being {@code
     * minecraft} in the second {@code if} statement, meaning that if a namespace is not specified it filters to any
     * paths matching the {@code input} {@link String}.</p>
     *
     * @author Harley O'Connor
     * @see CommandSource#forEachMatching(Iterable, String, Function, Consumer)
     */
    @Overwrite
    static <T> void forEachMatching(Iterable<T> iterable, String string, Function<T, Identifier> function, Consumer<T> consumer) {
        boolean inputContainsColon = string.indexOf(58) > -1;
        for (T resource : iterable) {
            Identifier identifier = function.apply(resource);
            if (inputContainsColon) {
                String identifierString = identifier.toString();

                if (CommandSource.shouldSuggest(string, identifierString)) {
                    consumer.accept(resource);
                }
            } else if (CommandSource.shouldSuggest(string, identifier.getNamespace()) || CommandSource.shouldSuggest(string, identifier.getPath())) {
                consumer.accept(resource);
            }
        }

    }
}
