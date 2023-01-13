package AutoRacing;

public enum CarType {
    SEDAN ("Седан"),
    HATCHBACK ("Хетчбек"),
    COUPE ("Купе"),
    WAGON ("Универсал"),
    JEEP ("Внедорожник"),
    CROSSOVER ("Кроссовер"),
    PICKUP ("Пикап"),
    VAN ("Фургон"),
    MINIVAN ("Минивэн");
    private String bodyType;

    CarType(String bodyType) {
        this.bodyType = bodyType;
    }

    public String getBodyType() {
        return bodyType;
    }
}
