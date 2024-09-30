package net.zoey.cozyliving.item;

import net.minecraft.component.type.FoodComponent;
import net.minecraft.entity.effect.StatusEffectInstance;

import static net.minecraft.entity.effect.StatusEffects.REGENERATION;

public class ModFoodComponents {
    public static final FoodComponent CINNAMON_BUN = new FoodComponent.Builder()
            .nutrition(5)
            .saturationModifier(1)
            .statusEffect(new StatusEffectInstance(REGENERATION, 150, 0), 1)
            .build();
    public static final FoodComponent RASPBERRY = new FoodComponent.Builder()
            .nutrition(1)
            .saturationModifier(0.5f)
            .snack()
            .build();
    public static final FoodComponent CANDY_APPLE = new FoodComponent.Builder()
            .nutrition(5)
            .saturationModifier(1.5f)
            .snack()
            .build();
    public static final FoodComponent HEAVY_CREAM = new FoodComponent.Builder()
            .nutrition(3)
            .saturationModifier(0.5f)
            .build();
}
