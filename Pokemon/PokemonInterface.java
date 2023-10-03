// PokemonInterface.java
public interface PokemonInterface {
    String getNome();
    void setNome(String nome);
    String getTipo();
    void setTipo(String tipo);
    int getSaude();
    void setSaude(int saude);
    void atacaPokemon(Pokemon pokemon);
    void pokemonInfo(Pokemon pokemon);
}
