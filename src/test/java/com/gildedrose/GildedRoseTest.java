package com.gildedrose;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GildedRoseTest {

    @Test
    void AgedBrieIncreasesInQuality() {
        Item[] items = {new Item("Aged Brie", 1, 1)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.abstractItems.get(0).name);
        assertEquals(2, app.abstractItems.get(0).quality);
    }
    @Test
    void AgedBrieDoublesInQualityPastSellIn() {
        Item[] items = new Item[] { new Item("Aged Brie", -1, 2) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.abstractItems.get(0).name);
        assertEquals(4, app.abstractItems.get(0).quality);
    }
    @Test
    void ItemQualityNeverNegative() {
        Item[] items = new Item[] { new Item("Elixir of the Mongoose", -1, 1) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Elixir of the Mongoose", app.abstractItems.get(0).name);
        assertEquals(0, app.abstractItems.get(0).quality);
    }
    @Test
    void NormalDecreasesInQuality() {
        Item[] items = new Item[] { new Item("Elixir of the Mongoose", 1, 3) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Elixir of the Mongoose", app.abstractItems.get(0).name);
        assertEquals(2, app.abstractItems.get(0).quality);
    }
    @Test
    void NormalDecreasesInQualityBy2WhenSellInBelow0() {
        Item[] items = new Item[] { new Item("Elixir of the Mongoose", -1, 3) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Elixir of the Mongoose", app.abstractItems.get(0).name);
        assertEquals(1, app.abstractItems.get(0).quality);
    }
    @Test
    void BackstagePassIncreasesInQuality() {
        Item[] items = new Item[] { new Item("Backstage passes to a TAFKAL80ETC concert", 12, 3) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.abstractItems.get(0).name);
        assertEquals(4, app.abstractItems.get(0).quality);
    }
    @Test
    void BackstagePassIncreasesInQualityBy2WhenSellInUnder10() {
        Item[] items = new Item[] { new Item("Backstage passes to a TAFKAL80ETC concert", 9, 3) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.abstractItems.get(0).name);
        assertEquals(5, app.abstractItems.get(0).quality);
    }
    @Test
    void BackstagePassIncreasesInQualityBy3WhenSellInUnder5() {
        Item[] items = new Item[] { new Item("Backstage passes to a TAFKAL80ETC concert", 4, 3) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.abstractItems.get(0).name);
        assertEquals(6, app.abstractItems.get(0).quality);
    }
    @Test
    void BackstagePassQualityNotAbove50() {
        Item[] items = new Item[] { new Item("Backstage passes to a TAFKAL80ETC concert", 4, 50) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.abstractItems.get(0).name);
        assertEquals(50, app.abstractItems.get(0).quality);
    }
    @Test
    void BackstagePassQuality0PastSellIn() {
        Item[] items = new Item[] { new Item("Backstage passes to a TAFKAL80ETC concert", 0, 30) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.abstractItems.get(0).name);
        assertEquals(0, app.abstractItems.get(0).quality);
    }
    @Test
    void SulfurasQualityUnchanged() {
        Item[] items = new Item[] { new Item("Sulfuras, Hand of Ragnaros", 4, 80) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.abstractItems.get(0).name);
        assertEquals(80, app.abstractItems.get(0).quality);
    }
    @Test
    void SulfurasQualityUnchangedAndNormalChanged() {
        Item[] items = new Item[] { new Item("Sulfuras, Hand of Ragnaros", 4, 80), new Item("Elixir of the Mongoose", 1, 3) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(80, app.abstractItems.get(0).quality);
        assertEquals(2, app.abstractItems.get(1).quality);
    }
    @Test
    void AgedBrieIncreasesButNormalDecreasesPastSellIn() {
        Item[] items = new Item[] { new Item("Aged Brie", -1, 2), new Item("Elixir of the Mongoose", -1, 3) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(4, app.abstractItems.get(0).quality);
        assertEquals(1, app.abstractItems.get(1).quality);
    }
    @Test
    void ConjuredItemDecreasesQualityTwiceAsFast() {
        Item[] items = new Item[] { new Item("Conjured Mana Cake", 3, 6) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(4, app.abstractItems.get(0).quality);
    }
}
