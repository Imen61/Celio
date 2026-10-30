Feature: ajout produit au panier

Scenario: ajouter un produit au panier

Given l'utilisateur est sur la page du produit "Jean barrel 100% coton - bleu brut"

When l'utilisateur clique sur Ajouter au panier et clique sur commander

Then le produit "Jean barrel 100% coton - bleu brut" est ajouté au panier 