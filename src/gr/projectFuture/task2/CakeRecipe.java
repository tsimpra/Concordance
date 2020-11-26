package gr.projectFuture.task2;

import java.util.Arrays;
import java.util.List;

public class CakeRecipe {

    private static String[] getRecipeTextArray() {
        String[] strings = {
                "Recipe for three milk cake", //
                "Preheat the oven to gas 160 degrees", //
                "Grease and line a 33 by 22 cm baking tin", //
                "Sift the flour and baking powder into a bowl and set aside", //
                "Put the butter and sugar in a large mixing bowl", //
                "Beat with an electric whisk for two minutes until well combined", //
                "Beat in the eggs one at a time then beat in the vanilla", //
                "Fold in the flour and baking powder with a spoon until just combined", //
                "Transfer to the cake tin and level with the back of a spoon", //
                "Bake on the middle shelf of the oven for 25 minutes", //
                "Check that a skewer inserted into the centre comes out clean", //
                "Set aside in the tin on a wire rack until completely cool", //
                "Use the baking paper to remove the cake from the tin", //
                "Transfer the cake to a large baking tray", //
                "Use a skewer to pierce the cake all the way through all over", //
                "Covering most of the top of the cake with he skewer", //
                "Whisk the three milks together in a bowl or large jug", //
                "Pour the mix evenly over the cake", //
                "Set aside until the liquid has been absorbed by the sponge", //
                "Whisk the cream and buttermilk until soft peaks form", //
                "Transfer the cake onto a serving plate or board", //
                "Spread over the cream", //
                "Mix together the cinnamon and cocoa powder", //
                "Sift the mixture over the cake", //
                "Make the sponge 48 hours ahead", //
                "Keep the sponge at room temperature in an airtight container", //
                "The finished cake will keep in the fridge for up to two days", //
                "Freeze the un-iced sponge in clingfilm and for up to a month", //
        };
        return strings;
    }

    public static List<String> getRecipeLines() {
        List<String> recipeList = Arrays.asList(getRecipeTextArray());
        return recipeList;
    }
}