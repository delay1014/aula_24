public class TestePokemon {
    public static void main(String[] args) {
        // Criando uma instância da Pokedex
        Pokedex pokedex = new Pokedex();

        // Criando alguns Pokémon usando a Pokedex
        Pokemon pikachu = pokedex.criaPokemon("Pikachu", "Elétrico", 100);
        Pokemon charmander = pokedex.criaPokemon("Charmander", "Fogo", 95);

        // Exibindo informações dos Pokémon
        pokedex.pokemonInfo(pikachu);
        pokedex.pokemonInfo(charmander);

        // Simulando uma batalha entre Pikachu e Charmander
        pikachu.atacaPokemon(charmander);
        charmander.atacaPokemon(pikachu);

        // Exibindo informações atualizadas dos Pokémon após a batalha
        pokedex.pokemonInfo(pikachu);
        pokedex.pokemonInfo(charmander);
    }
}