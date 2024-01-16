// Інтерфейс для рицарів
interface Knight {
    void attack();
}

// Інтерфейс для магів
interface Mage {
    void castSpell();
}

// Абстрактна фабрика для створення сімейства рицарів і магів
interface KingdomFactory {
    Knight createKnight();
    Mage createMage();
}

// Конкретна реалізація рицаря льодяного королівства
class IceKnight implements Knight {
    @Override
    public void attack() {
        System.out.println("Ice Knight attacks with a frosty sword!");
    }
}

// Конкретна реалізація мага льодяного королівства
class IceMage implements Mage {
    @Override
    public void castSpell() {
        System.out.println("Ice Mage casts a freezing spell!");
    }
}

// Конкретна реалізація фабрики для льодяного королівства
class IceKingdomFactory implements KingdomFactory {
    @Override
    public Knight createKnight() {
        return new IceKnight();
    }

    @Override
    public Mage createMage() {
        return new IceMage();
    }
}

// Конкретна реалізація рицаря вогняного королівства
class FireKnight implements Knight {
    @Override
    public void attack() {
        System.out.println("Fire Knight attacks with a fiery sword!");
    }
}

// Конкретна реалізація мага вогняного королівства
class FireMage implements Mage {
    @Override
    public void castSpell() {
        System.out.println("Fire Mage casts a fireball spell!");
    }
}

// Конкретна реалізація фабрики для вогняного королівства
class FireKingdomFactory implements KingdomFactory {
    @Override
    public Knight createKnight() {
        return new FireKnight();
    }

    @Override
    public Mage createMage() {
        return new FireMage();
    }
}
public class Main {
    public static void main(String[] args) {
        // Використовуємо льодяну фабрику
        KingdomFactory iceKingdomFactory = new IceKingdomFactory();
        Knight iceKnight = iceKingdomFactory.createKnight();
        Mage iceMage = iceKingdomFactory.createMage();

        iceKnight.attack();
        iceMage.castSpell();

        // Використовуємо вогняну фабрику
        KingdomFactory fireKingdomFactory = new FireKingdomFactory();
        Knight fireKnight = fireKingdomFactory.createKnight();
        Mage fireMage = fireKingdomFactory.createMage();

        fireKnight.attack();
        fireMage.castSpell();
    }
}
