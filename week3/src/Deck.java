    public class Deck {
        private List<Card> cards;

        public Deck() {
            cards = new ArrayList<>();
            initializeDeck();
        }

        private void initializeDeck() {
            Rank[] ranks = Rank.values;
            Suit[] suits = Suit.values;

            for (Suit suit : suits) {
                for (Rank rank : ranks) {
                    Card card = new Card(rank, suit);
                    cards.add(card);
                }
            }
        }

        public List<Card> getCards() {
            return cards;
        }

        public int getSize() {
            return cards.size();
        }
    }

