Feature: Parcourir le menu

Scenario: cliquer sur le menu et le sous menu

Given  l'utilisateur est sur la page d'accueil

When  l'utilisateur survol sur le menu "Collection" et clique sur le sous menu "Jeans"

Then l'utilisateur est dirigé vers la page du sous menu "Jeans"