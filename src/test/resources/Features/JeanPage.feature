Feature:  Page Jeans

Scenario: l'utilisateur clique sur un produit
Given l'utilisateur est sur la page Jeans
When l'utilisateur clique sur le produit "Jean barrel 100% coton - bleu brut"

Then la page de produit est affichée "Jean barrel 100% coton - bleu brut"