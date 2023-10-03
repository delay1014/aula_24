// Pokedex.java
public class Pokedex extends PokemonAbstract implements PokemonInterface {
    @Override
    public Pokemon criaPokemon(String nome, String tipo, int saude) {
        return new Pokemon(nome, tipo, saude);
    }

    @Override
    public void atacaPokemon(Pokemon pokemon) {
        // Implemente a lógica para atacar outro Pokémon aqui
    }

    @Override
    public void pokemonInfo(Pokemon pokemon) {
        // Implemente a lógica para exibir informações do Pokémon aqui
    }
}
