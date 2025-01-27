import { Component } from '@angular/core';
import { ARTICULOS } from '../../../../public/data/data';
import { Article } from '../../models/article';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-articles',
  imports: [CommonModule],
  templateUrl: './articles.component.html',
  styleUrl: './articles.component.css'
})
export class ArticlesComponent {

  articles: Array<Article> = ARTICULOS;
  article: Article = ARTICULOS[0];
  categories: Set<string> = new Set();
  isShowed: boolean = false;

  constructor() {
    this.categories.add('Todos');
    this.articles.forEach(article => this.categories.add(article.categoria));
  }

  comprar(articulo: Article) {
    alert(`Has comprado ${articulo.nombre}`);
  }

  showArticles(event: Event) {
    this.isShowed = false;
    const category = (event.target as HTMLSelectElement).value;
    if (category === 'Todos') {
      this.articles = ARTICULOS;
    } else {
      this.articles = ARTICULOS.filter(article => article.categoria === category);
    }
  }

  showArticle(id: string) {
    this.isShowed = true;
    const art = ARTICULOS.find(article => article.id === id);
    if (art) {
      this.article = art;
    }
  }
}