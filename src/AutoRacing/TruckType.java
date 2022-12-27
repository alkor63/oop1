package AutoRacing;

public enum TruckType {

        N1(" до 3,5 тонн"),
        N2(" от 3,5 до 12 тонн"),
        N3(" свыше 12 тонн");

        private String tonnage;

        TruckType(String tonnage) {
            this.tonnage = tonnage;
        }

        public String getTonnage() {
            return tonnage;
        }
    }

