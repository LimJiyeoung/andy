import Vue from 'vue'
import VueRouter from 'vue-router'
import PageLayout from '@/layouts/page'
import AdminLayout from '@/layouts/admin'

Vue.use(VueRouter)

const routes = [
  {
    path: '/', component: PageLayout, children: [
      {path: '/', name: 'home', component: () => import("@/views/Home")},
      {path: 'about', name: 'about', component: () => import("@/views/About")},
    ]
  },
  {
    path: '/admin', component: AdminLayout, children: [
      {path: '/', name: 'index', component: () => import("@/views/admin/index")},
      {path: 'system/program', name: 'program', component: () => import("@/views/admin/system/Program")}
    ]
  },
]

const router = new VueRouter({
  mode: 'history',
  base: process.env.BASE_URL,
  routes
})

export default router
