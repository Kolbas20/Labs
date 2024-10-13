import java.util.*

class BlackjackGame {
    private val deck = DeckOfCards()
    private lateinit var playerHand: Hand
    private lateinit var dealerHand: Hand

    init {
        reset()
    }

    fun play(): Int {
        for (i in 1..2) {
            playerHand.addCard(deck.draw())
            dealerHand.addCard(deck.draw())
        }

        while (!playerHand.bust() && !dealerHand.bust()) {
            if (!playerHand.stands()) playerHand.addCard(deck.draw())
            if (!dealerHand.stands()) dealerHand.addCard(deck.draw())
        }

        if (playerHand.score() > 21 || dealerHand.score() > 21) {
            return if (playerHand.score() > 21) BUST else dealerHand.score()
        }

        if (playerHand.score() > dealerHand.score()) {
            return PLAYER_WINS
        } else if (playerHand.score() < dealerHand.score()) {
            return DEALER_WINS
        } else {
            return DRAW
        }
    }

    fun reset() {
        playerHand = Hand()
        dealerHand = Hand()
    }

    companion object {
        const val BUST = -1
        const val PLAYER_WINS = 1
        const val DEALER_WINS = -1
        const val DRAW = 0
    }
}

class Card(val rank: Rank, val suit: Suit) {
    override fun toString(): String {
        return "$rank of $suit"
    }
}

enum class Rank(val value: Int) {
    ACE(1), TWO(2), THREE(3), FOUR(4), FIVE(5), SIX(6), SEVEN(7), EIGHT(8), NINE(9), TEN(10);

    companion object {
        fun fromIndex(index: Int): Rank {
            return values()[index]
        }
    }
}

enum class Suit(val index: Int) {
    CLUBS(0), DIAMONDS(1), HEARTS(2), SPADES(3);

    companion object {
        fun fromIndex(index: Int): Suit {
            return values()[index]
        }
    }
}

class DeckOfCards {
    private val cards = mutableListOf<Card>()

    init {
        repeat(4) { suit ->
            repeat(13) { rank ->
                cards.add(Card(Rank.fromIndex(rank), Suit.fromIndex(suit)))
            }
        }
    }

    fun draw(): Card {
        return cards.removeAt(0)
    }
}

class Hand {
    private val hand = mutableListOf<Card>()

    fun addCard(card: Card) {
        hand.add(card)
    }

    fun stands(): Boolean {
        return hand.any { it.rank == Rank.ACE && hand.filter { it.rank == Rank.TEN || it.rank == Rank.ACE }.size >= 2 }
    }

    fun bust(): Boolean {
        return score() > 21
    }

    fun score(): Int {
        var score = 0
        hand.forEach {
            if (it.rank == Rank.ACE) {
                score += 11
            } else if (it.rank == Rank.TEN) {
                score += 10
            } else {
                score += it.rank.value
            }
            
            if (score > 21 && hand.filter { it.rank == Rank.ACE }.size > 0) {
                score -= 10
            }
        }
        return score
    }

    override fun toString(): String {
        return hand.joinToString(", ") { it.toString() }
    }
}

fun main() {
    val game = BlackjackGame()
    repeat(10) {
        println("Player's hand: ${game.playerHand}, Dealer's hand: ${game.dealerHand}")
        println("Player's score: ${game.playerHand.score()}\tDealer's score: ${game.dealerHand.score()}")
        println("Result: ${game.play()} (Press Enter to start a new game)")
        System.in.read()
        game.reset()
    }
}
