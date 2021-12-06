<template>
  <v-navigation-drawer app>
    <div v-for="item in items" :key="item.id">

      <v-list-item
          v-if="!item.children"
          :active-class="color"
          avatar link>

        <v-list-item-icon>
          <v-icon>{{ item.icon }}</v-icon>
        </v-list-item-icon>

        <v-list-item-title v-text="item.title" />
      </v-list-item>

      <v-list-group
          v-else
          :key="item.id"
          :prepend-icon="item.icon">

        <template v-slot:activator>
          <v-list-item-title>{{ item.title }}</v-list-item-title>
        </template>

        <v-list-item
            v-for="child in item.children"
            :key="child.id" link>

          <v-list-item-icon>
          </v-list-item-icon>

          <v-list-item-title>{{ child.title }}</v-list-item-title>
        </v-list-item>

      </v-list-group>
    </div>
  </v-navigation-drawer>
</template>

<script>
export default {
  name: 'Navbar',
  data: () => ({
    items: [
      {id: 1, title: 'Home', icon: 'mdi-home', to: '/admin'},
      {id: 2, title: '시스템 관리', icon: 'mdi-cog',
        children: [
          { id: 3, title: '프로그램 관리' },
          { id: 4, title: '메뉴 관리' },
          { id: 5, title: '에러로그 관리' },
        ]
      },
    ]
  })
}
</script>
