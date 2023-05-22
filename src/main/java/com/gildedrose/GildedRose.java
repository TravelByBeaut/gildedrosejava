package com.gildedrose;

import java.util.ArrayList;
import java.util.List;

class GildedRose {
    public List<AbstractItem> abstractItems = new ArrayList<>();

    public GildedRose(Item[] items) {
        for (Item item : items) {
            if (item.name.equals("Sulfuras, Hand of Ragnaros")) {
                abstractItems.add(new Sulfuras(item));
            }
            if (item.name.equals("Backstage passes to a TAFKAL80ETC concert")) {
                abstractItems.add(new BackstagePass(item));
            }
            if (item.name.equals("Aged Brie")) {
                abstractItems.add(new Brie(item));
            }
            if (item.name.equals("Elixir of the Mongoose")) {
               abstractItems.add(new Normal(item));
            }
            if (item.name.equals("Conjured Mana Cake")) {
                abstractItems.add(new Conjured(item));
            }
        }
    }

    public void updateQuality() {
        for (AbstractItem abstractItem : abstractItems) {
            abstractItem.updateSellIn();
            abstractItem.updateQuality();
        }
    }
}
